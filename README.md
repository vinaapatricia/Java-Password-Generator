# Java-Password-Generator

# Arduino PIR Sensor Traffic Light Simulation

![Mata Kuliah](https://img.shields.io/badge/Mata%20Kuliah-Organisasi%20dan%20Arsitektur%20Komputer-green)
## The Background
<div align="justify">
The Arduino PIR traffic light simulation is a project that uses a computer or electronic system to model or mimic how a traffic light system works using a PIR (Passive Infrared Sensor) motion sensor and an Arduino microcontroller.

PIR is a sensor that can detect movement in its surroundings by observing the heat changes caused by the movement. The Arduino microcontroller is an electronic system that can be programmed to control various electronic devices, including traffic lights.

Using this simulation, we can learn how the traffic light system works and how the PIR sensor and Arduino microcontroller can be used to control traffic lights according to needs. This simulation can also be used to understand how the traffic light system can be optimized to work more efficiently and safely.
</div>

## Objective
<div align="justify">
The purpose of having traffic lights are:
1. Avoiding obstacles due to differences in road flow for vehicle movement. 
2. Facilitating intersections between main roads for vehicles and pedestrians and secondary roads so that smooth traffic flow can be guaranteed 
3. Reducing the level of accidents caused by collisions due to differences in road flow
</div>

## Basic Theory
<div align="justify">
Traffic lights according to Law no. 22/2009 concerning road traffic and transportation, namely a traffic signaling device or (APILL) is a lamp that controls the flow of traffic installed at crossroads, pedestrian crossings (zebra crossings), and other places of traffic flow. This light indicates when the vehicle must run and stop alternately from various directions. 

Traffic regulation at crossroads is intended to regulate the movement of vehicles in each group of vehicle movements so that they can move alternately so that they do not interfere with each other between existing traffic. Traffic lights have been adopted in almost all cities in the world. This light uses the color that is universally recognized to indicate a stop is red, be careful which is marked in yellow, and green which means it can run. 
<div>

### Tools & Materials
| No  | Alat | Jumlah |
| ------------- | ------------- | ------------- |
| 1 |Laptop | 1 |
| 2 |Software Arduino IDE | 1 |
| 3 |Arduino Uno R3 | 1 |
| 4 |Cable USB type B | 1 |
| 5 |Breadboard | 1 |
| 6 |Led red | 1 |
| 7 |Led yellow | 1 |
| 8 |Led green | 1 |
| 9 |Buzzer 3v | 1 |
| 10 |Sensor PIR | 1 |
| 11 |7 Segment 4 Digit | 1 |
| 12 |Resistor 220 ohm | 5 |
| 13 |cable jumper male to male | 16 |
| 14 |cable jumper male to female | 3 |

## Result
<div align="center">

![Hasil](https://miro.medium.com/max/828/0*QB1dxamMZmcAi8--)

</div>

## Discussion
<div align="justify">
Through this experiment, a miniature product or traffic light simulation was obtained. Armed with the components mentioned in the tools and materials section, a machine was born that can turn on green, yellow and red lights alternately with time intervals of 8 seconds, 2 seconds and 10 seconds respectively. 

The length of time the light can last can be reset as needed through changes in the code section on the Arduino. In addition to making the green, yellow and red lights flash alternately like traffic lights in general, this machine also has an indicator screen for how long the lights are on. The indicator light is run using a 7 segment 4 digit display. 

The way it works is for each number to be displayed, the machine will choose which segment will turn on and which segment will turn off. The presence of this indicator screen is useful so that drivers or people who see it know how much longer the traffic light will change color (switch to a light with a different color). As a form of innovation, this experimental machine is also equipped with a motion sensor and a buzzer (a kind of loudspeaker). 

These two components are used with the aim that if there is an object, or in the real world of a vehicle, that is still forcing it to cross a traffic light when the light is red, the sensor will detect this movement which then triggers the buzzer to sound. In its application in the real world, the sound of the buzzer is expected to make the vehicle stop and not break through traffic lights.

Even if the vehicle is still moving, at least other drivers will be aware of the violating vehicle so that the possibility of a collision or accident can be minimized a little. Although this traffic light simulation engine can work quite well, there are still some problems that arise. First, the sensor used is an area scanning type sensor so that the sensor does not only detect objects in front of it, but also objects around it (left, right, and so on). 
This can cause when there are no objects passing in front of the sensor, but there are objects around the sensor, the buzzer will still sound. Second, there are also cases when an object passes through the sensor at high speed, it is possible that the sensor will fail to detect it so that the buzzer will not sound. 

Final, problems arise when changes are made to the machine mechanism (program code). When that happens, it takes at least 30 seconds for the machine to run normally. Thus, there is a span of time when the machine is not functioning so that it can disrupt the course of activities, whether it's testing during machine demos, or traffic when referring to the real world. For future development, existing constraints can be overcome by using better tools and materials as well as more optimal program formulation.
</div>

## Conclusion
<div align="justify">

From this traffic light simulation experiment it can be concluded:
The light will turn on alternately with a green time span of 8 seconds, yellow for 2 seconds, and red for 10 seconds plus an indicator for how long the light is on using a 7 segment 4 digit display. And equipped with a sensor that is connected to a buzzer, which will sound when motion is detected by the sensor when the light is red. However, there are several problems that arise in the sensor, namely:

- The sensor used is an area scanning type sensor so that the sensor does not only detect objects in front of it, but also objects around it (left, right, and so on). This can cause when there are no objects passing in front of the sensor, but there are objects around the sensor, the buzzer will still sound.
- There are also cases when an object passes through the sensor at high speed, it is possible that the sensor will fail to detect it so that the buzzer will not sound.
- Problems arise when changes are made to the machine mechanism (program code). When that happens, it takes at least 30 seconds for the machine to run normally.

</div>
