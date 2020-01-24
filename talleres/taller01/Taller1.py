#Punto 1
import math
class Punto2D:
  """Representacion de punto en 2 dimensiones"""

  def __init__(self, x, y):
    self.x = x
    self.y = y

  def get_x(self):
    return self.x

  def get_y(self):
    return self.y

  def polar_radius(self):
    return math.sqrt(self.x*self.x + self.y*self.y)

  def polar_angle(self):
    angulo = math.atan2(self.y,self.x)
    return (angulo)

  def euclidian_dist(self, other):
    return math.sqrt(((self.x-other.x)**2)+((self.y-other.y)**2))

origen = Punto2D(0,0)
punto = Punto2D(10,20)

print('X value is',str(punto.get_x()))
print('Y value is',str(punto.get_y()))
print('The polar radius is',str(punto.polar_radius()),'units long.')
print('The polar angle measures',str(punto.polar_angle()),'radians.')
print('The euclidian distance between the point and the origin is',str(punto.euclidian_dist(origen)),'units long.')

#Punto 2
class Date:
  def __init__(self, day, month, year):
    self.day = day
    self.month = month
    self.year = year

  def __str__(self):
    return str(self.day) + "-" + str(self.month) + "-" + str(self.year)

  def compare_dates(self, date):
    if date.year == self.year and date.month == self.month and date.day == self.day:
        return 'This date is the same.'
    if date.year > self.year or date.year == self.year and date.month > self.month or date.year == self.year and date.month == self.month and date.day > self.day:
        return 'This date is after.'
    return 'This date is before'

#A = Date(23,1,1997)
#B = Date(23,2,1997)
#C = Date(10,8,1996)
#D = Date(23,1,1997)
#A.compare_dates(B)
#A.compare_dates(D)
#A.compare_dates(C)
