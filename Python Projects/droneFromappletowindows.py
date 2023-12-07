from djitellopy import Tello
import keyboard
import time
import cv2
import os

# Connect to the Tello drone
tello = Tello()
tello.connect()
time.sleep(2)
tello.streamon()
print("It's here")
# Set the file path to save photos on the desktop
file_path = os.path.expanduser(r"C:\Users\natti\Downloads\Dronefootage")#Add the photo storage
print("It's here")
# Create the directory if it doesn't exist
if not os.path.exists(file_path):
    os.makedirs(file_path)
print("It's here")
# Get the Tello video stream
video_stream = tello.get_frame_read()
print("Press '1' to begin:")


def take_picture(file_name):
    frame = video_stream.frame
    cv2.imwrite(file_name, cv2.cvtColor(frame, cv2.COLOR_BGR2RGB))


def takeoff_and_rotate():
    print("Taking off and rotating")
    tello.takeoff()
    tello.move_up(20)
    tello.rotate_clockwise(45)
    photo_path = os.path.join(file_path, 'takeoff_rotate.jpg')
    take_picture(photo_path)
    tello.rotate_counter_clockwise(45)
    time.sleep(2)
    print("Press any of these keys: 2,3,4")


def turn_anti_clockwise():
    print("Turning anti-clockwise")
    tello.rotate_counter_clockwise(45)
    photo_path = os.path.join(file_path, 'turn_anti_clockwise.jpg')
    take_picture(photo_path)
    tello.rotate_clockwise(45)
    time.sleep(2)
    print("Press any of these keys: 1,3,4")


def photo_and_movement_sequence():
    print("Taking photos and moving in a sequence")
    photo_path = os.path.join(file_path, 'photo_sequence.jpg')
    take_picture(photo_path)
    tello.move_right(50)
    photo_path = os.path.join(file_path, 'move_right.jpg')
    take_picture(photo_path)
    tello.move_down(50)
    photo_path = os.path.join(file_path, 'move_down.jpg')
    take_picture(photo_path)
    tello.move_left(50)
    photo_path = os.path.join(file_path, 'move_left.jpg')
    take_picture(photo_path)
    tello.move_up(50)
    photo_path = os.path.join(file_path, 'move_up.jpg')
    take_picture(photo_path)
    time.sleep(2)
    print("Press any of these keys: 1,2,4")


def flip_and_land():
    print("Flipping forward, going down, flipping backward, and landing")
    tello.flip_forward()
    tello.move_down(50)
    tello.flip_back()
    tello.land()
    time.sleep(2)
    print("Press any of these keys: 1,2,3")


# Define key bindings
keyboard.on_press_key('1', lambda _: takeoff_and_rotate())
keyboard.on_press_key('2', lambda _: turn_anti_clockwise())
keyboard.on_press_key('3', lambda _: photo_and_movement_sequence())
keyboard.on_press_key('4', lambda _: flip_and_land())

try:
    while True:
        time.sleep(0.1)
except KeyboardInterrupt:
    pass
finally:
    # Land the drone when the script is interrupted
    tello.land()
    keyboard.unhook_all()
    tello.end()
