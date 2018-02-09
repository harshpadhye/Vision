package org.usfirst.frc.team2590.robot;

import org.opencv.core.Mat;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends IterativeRobot {

	GripPipeline pipeline = new GripPipeline();
	
	UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();;
	Mat mat = new Mat();
	
	@Override
	public void robotInit() {
	}
	
	
	@Override
	public void autonomousInit() {
	}

	
	@Override
	public void autonomousPeriodic() {
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {

		camera = CameraServer.getInstance().startAutomaticCapture();
		
		//captures mats from camera
		CvSink cvSink = CameraServer.getInstance().getVideo();
		
		mat = new Mat();
		cvSink.grabFrame(mat);
		
		pipeline.process(mat);
		org.opencv.core.Point p = pipeline.center(pipeline.getContours().get(0));
		
		SmartDashboard.putNumber("Center X", p.x);
		SmartDashboard.putNumber("Center Y", p.y);
	}

}

