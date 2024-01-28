import os
from PIL import Image

input_folder = 'src/main/resources/assets/terrariamod/textures/item'

def process_directory(directory):
    for entry in os.listdir(directory):
        entry_path = os.path.join(directory, entry)

        if os.path.isdir(entry_path):
            # Recursively process subdirectories
            process_directory(entry_path)
        elif entry_path.lower().endswith('.png'):
            # Process PNG files
            process_png_file(entry_path)

def process_png_file(png_file_path):
    print(png_file_path)
    with Image.open(png_file_path) as img:
        # Square the image
        square_size = max(img.size)
        new_img = Image.new('RGBA', (square_size, square_size), (0, 0, 0, 0))
        new_img.paste(img, ((square_size - img.width) // 2, (square_size - img.height) // 2))

        # Generate new file name
        file_base_name = os.path.splitext(os.path.basename(png_file_path))[0]
        new_file_name = file_base_name.replace("'", "").lower().replace(" ", "_") + '.png'
        new_file_path = os.path.join(os.path.dirname(png_file_path), new_file_name)

        # Save the squared image
        new_img.save(new_file_path)

        if new_file_path != png_file_path:
            # Remove the original file if the name has changed
            os.remove(png_file_path)

# Start processing from the input folder
process_directory(input_folder)

print("Images have been processed and saved.")
