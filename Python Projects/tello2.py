'''from djitellopy import Tello
import pygame
import cv2

tello = Tello()

tello.start()
tello.takeoff()
tello.land()

# Connect to the Tello drone
tello = Tello()
tello.connect()

# Takeoff
tello.takeoff()

# Move forward to create the letter M
tello.move_forward(50)
tello.rotate_counter_clockwise(90)
tello.move_forward(50)
tello.rotate_clockwise(180)
tello.move_forward(50)
tello.rotate_counter_clockwise(90)
tello.move_forward(50)

# Do a 360-degree rotation
tello.rotate_clockwise(360)

# Take a photo
tello.take_picture()

# Land
tello.land()

# Disconnect
tello.end()'''

from djitellopy import Tello
import keyboard
import time
import os

# Connect to the Tello drone
tello = Tello()
tello.connect()

# Set the file path to save photos on the desktop
#file_path = os.path.expanduser("~/Desktop/TelloPhotos")

# Create the directory if it doesn't exist
#if not os.path.exists(file_path):
    #os.makedirs(file_path)

def takeoff_and_rotate():
    print("Taking off and rotating")
    tello.takeoff()
    tello.move_up(20)
    tello.rotate_clockwise(45)
    photo_path = os.path.join( 'takeoff_rotate.jpg')
    tello.take_picture(photo_path)
    tello.rotate_counter_clockwise(45)

def turn_anti_clockwise():
    print("Turning anti-clockwise")
    tello.rotate_counter_clockwise(45)
    photo_path = os.path.join( 'turn_anti_clockwise.jpg')
    tello.take_picture(photo_path)
    tello.rotate_clockwise(45)

def photo_and_movement_sequence():
    print("Taking photos and moving in a sequence")
    photo_path = os.path.join( 'photo_sequence.jpg')
    tello.take_picture(photo_path)
    tello.move_right(15)
    photo_path = os.path.join( 'move_right.jpg')
    tello.take_picture(photo_path)
    tello.move_down(15)
    photo_path = os.path.join( 'move_down.jpg')
    tello.take_picture(photo_path)
    tello.move_left(15)
    photo_path = os.path.join( 'move_left.jpg')
    tello.take_picture(photo_path)
    tello.move_up(15)
    photo_path = os.path.join( 'move_up.jpg')
    tello.take_picture(photo_path)

def flip_and_land():
    print("Flipping forward, going down, flipping backward, and landing")
    tello.flip_forward()
    tello.move_down(15)
    tello.flip_back()
    tello.land()

# Define key bindings#

keyboard.on_press_key('1', takeoff_and_rotate())
#takeoff_and_rotate()
#turn_anti_clockwise()
#photo_and_movement_sequence()
#flip_and_land()
keyboard.on_press_key('2', turn_anti_clockwise())
keyboard.on_press_key('3', photo_and_movement_sequence())
keyboard.on_press_key('4', flip_and_land())

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