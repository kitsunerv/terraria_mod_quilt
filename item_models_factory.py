#!/bin/python3
import os
import json

# Define the input and output folders
input_folder = 'src/main/resources/assets/terrariamod/textures/item'
output_folder = 'src/main/resources/assets/terrariamod/models/item'

def process_directory(directory):
    # Iterate over all files and directories in the current directory
    for entry in os.listdir(directory):
        entry_path = os.path.join(directory, entry)
        
        if os.path.isdir(entry_path):
            # If entry is a directory, process it recursively
            process_directory(entry_path)
        elif entry.endswith('.png'):
            # Process PNG files
            process_png_file(entry_path)

def process_png_file(png_file_path):
    print(png_file_path)
    # Remove the input folder part and extension from the file path
    relative_path = os.path.relpath(png_file_path, input_folder)
    file_base_name = os.path.splitext(relative_path)[0]

    # Replace OS-specific path separators with forward slashes for JSON
    json_texture_path = file_base_name.replace(os.path.sep, '/')

    # Define the JSON structure
    json_data = {
        "parent": "item/generated",
        "textures": {
            "layer0": f"terrariamod:item/{json_texture_path}"
        }
    }

    # Create the corresponding JSON file in the output folder
    output_json_path = os.path.join(output_folder, f"{file_base_name}.json")
    os.makedirs(os.path.dirname(output_json_path), exist_ok=True)
    with open(output_json_path, 'w') as json_file:
        json.dump(json_data, json_file, indent=2)

# Start processing from the input folder
process_directory(input_folder)

print("JSON files have been created in the output folder.")