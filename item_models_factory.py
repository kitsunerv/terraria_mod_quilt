#!/bin/python3
import os
import json

# Define the input and output folders
input_folder = 'src/main/resources/assets/terrariamod/textures/item'
output_folder = 'src/main/resources/assets/terrariamod/models/item'

# Ensure the output folder exists
os.makedirs(output_folder, exist_ok=True)

# Iterate over all files in the input folder
for filename in os.listdir(input_folder):
    print(filename)
    if filename.endswith('.png'):
        # Extract the file name without the extension
        file_base_name = os.path.splitext(filename)[0]

        # Define the JSON structure
        json_data = {
            "parent": "item/generated",
            "textures": {
                "layer0": f"terrariamod:item/{file_base_name}"
            }
        }

        # Create the corresponding JSON file in the output folder
        output_file_path = os.path.join(output_folder, f"{file_base_name}.json")
        with open(output_file_path, 'w') as json_file:
            json.dump(json_data, json_file, indent=2)

print("JSON files have been created in the output folder.")
