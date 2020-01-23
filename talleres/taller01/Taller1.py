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
      return math.sqrt(x*x + y*y)

    def polar_angle(self, x, y):
      angulo = math.atan2(y,x)
      return math(angulo)

    def dist_euclidiana(self, other):
      return math.sqrt(((self.x-other.x)**2)+((self.y-other.y)**2))

punto_1 = Punto2D(10,20)
punto_2 = Punto2D(0,0)

punto_1.dist_euclidiana(punto_2)

punto_1.polar_angle(10,20)
