package org.firstinspires.ftc.teamcode.v1.util.deviceSpecs;

import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DeviceSpecs {
    DeviceSpecs (String name) {
        this.device = null;
        setDeviceSpecs(name);
    }

    DeviceSpecs (String name, HardwareMap map) {
        this.device = map.get(name);
        setDeviceSpecs(name);
    }

    DeviceSpecs (HardwareDevice device) {
        this.device = device;
        setDeviceSpecs(device.getDeviceName());
    }

    void setDeviceSpecs (String deviceType) {
        switch (device.getDeviceName()) {
            //
        }
    }

    //TODO: motors (type theese vars from https://www.gobilda.com/5202-series-yellow-jacket-planetary-gear-motor-71-2-1-ratio-24mm-length-6mm-d-shaft-84-rpm-36mm-gearbox-3-3-5v-encoder/)
    public  Motor_Size 	RS-555
    public  Motor_Type 	Brushed DC
    public  Nominal_Voltage 	12VDC
    public  Output_Shaft 	6mm D
    public  Gearbox_Style 	Planetary
    public  Gear_Ratio 	71.2:1
    public  Gear_Ratio Formula 	((((1+(46/17))) * (1+(46/17))) * (1+(46/11))):1
    public  Gear_Material 	Steel
    public  No-Load_Speed @ 12VDC 	84 RPM
    public  No-Load_Current @12VDC 	0.25A
    public  Stall_Current @12VDC 	9.2A
    public  Stall_Torque @12VDC 	93.6 kg.cm (1,310 oz-in)
    public  Wire_Length 	470mm (including connectors)
    public  Wire_Gauge 	18AWG
    public  Motor_Connector Type 	3.5mm FH-MC Bullet Connectors
    public  Encoder_Connector Type 	4-Pos JST XH [FH-MC]
    public  Encoder_Type 	Relative, Quadrature
    public  Encoder_Sensor Type 	Magnetic (Hall Effect)
    public  Encoder_Voltage Range 	3.3 - 5VDC
    public  Encoder_Resolution 	1,992.6 PPR at the Output Shaft
    public  Encoder_Resolution Formula 	(((((1+(46/17))) * (1+(46/17))) * (1+(46/11))) * 28)
    public  Weight _484g

    DeviceType type;
    HardwareDevice device;
}
