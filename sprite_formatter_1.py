import os
from PIL import Image

# Define the input and output folders
input_folder = 'src/main/resources/assets/terrariamod/textures/item'
output_folder = 'src/main/resources/assets/terrariamod/textures/item'

def process_directory(directory):
    # Iterate over all files and directories in the current directory
    for entry in os.listdir(directory):
        entry_path = os.path.join(directory, entry)
        
        if os.path.isdir(entry_path):
            # If entry is a directory, process it recursively
            process_directory(entry_path)
        elif entry.lower().endswith('.png'):
            # Process PNG files
            process_png_file(entry_path)

def process_png_file(png_file_path):
    print(png_file_path)
    # Open the image
    with Image.open(png_file_path) as img:
        # Convert to a square image
        square_img = make_square(img)

        # Generate the new file name
        new_file_name = generate_new_file_name(png_file_path)

        # Create the corresponding image file in the output folder
        output_image_path = os.path.join(output_folder, new_file_name)
        os.makedirs(os.path.dirname(output_image_path), exist_ok=True)
        square_img.save(output_image_path)

def make_square(img):
    # Calculate dimensions for a square image
    max_size = max(img.size)
    new_img = Image.new('RGBA', (max_size, max_size), (0, 0, 0, 0))
    new_img.paste(img, (int((max_size - img.size[0]) / 2), int((max_size - img.size[1]) / 2)))
    return new_img

def generate_new_file_name(png_file_path):
    # Remove the input folder part from the file path
    relative_path = os.path.relpath(png_file_path, input_folder)
    # Change to lowercase and remove apostrophes
    new_file_name = relative_path.lower().replace("'", "")
    return new_file_name

# Start processing from the input folder
process_directory(input_folder)

print("Images have been processed and saved in the output folder.")
