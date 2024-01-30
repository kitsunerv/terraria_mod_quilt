import os
import shutil

def move_json_files_to_main_folder():
    main_folder = 'src/main/resources/assets/terrariamod/models/item' 
    for root, dirs, files in os.walk(main_folder):
        for file in files:
            if file.endswith('.json'):
                # Construct the full file path
                file_path = os.path.join(root, file)

                # Move the file to the main folder
                shutil.move(file_path, main_folder)

    print("All JSON files have been moved to the main folder.")

# Execute the function
move_json_files_to_main_folder()
