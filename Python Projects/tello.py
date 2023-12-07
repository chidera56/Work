from djitellopy import Tello

tello = Tello()

tello.connect()
tello.takeoff()

tello.move_forward(50)
tello.move_left(100)
tello.rotate_clockwise(90)
tello.rotate_counter_clockwise(90)
tello.move_back(50)
tello.move_right(50)
tello.flip_forward(20)

tello.land()