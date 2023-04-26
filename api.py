import time
import serial
import requests
import json

def readserial(comport, baudrate):
    ser = serial.Serial(comport, baudrate, timeout=1)         # 1/timeout is the frequency at which the port is read
    url = "http://localhost:8080/sensorData"
    while True:
        data = ser.readline().decode().strip()
        print(data)
        #data = data.replace("\"", "'")  
        print(type(data))
        #d = str(data)
        #data = ast.literal_eval(data)
        if data.__contains__('{') and data.__contains__('}'):
            data1 = json.loads(data)
            response = requests.post("http://localhost:8080/sensorData",json=data1)
            print("Status Code", response.status_code)
            time.sleep(2)

if __name__ == '__main__':

    readserial('COM5', 9600)
    	