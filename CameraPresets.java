package org.usfirst.frc.team2590.robot;

public interface CameraPresets {
	static final double FOV_H = 61.37; // horizontal Field of View
	static final double FOV_V = 30.43; // vertical Field of View
	// static final double CAMERA_HEIGHT = 19.5;
	// static final double CAMERA_ANGLE = 23;
	static final double IMAGE_WIDTH = 320.0;
	static final double IMAGE_HEIGHT = 240.0;
	static final double CENTER_X = IMAGE_WIDTH / 2.0; // center x pixel
	static final double CENTER_Y = IMAGE_HEIGHT / 2.0; // center y pixel
	static final double DPP_X = FOV_H / IMAGE_WIDTH; // degrees per pixel in the x direction
	static final double DPP_Y = FOV_V / IMAGE_HEIGHT; // degrees per pixel in the y direction
}
