
/**
 * Clase principal que contiene métodos para realizar cálculos estadísticos
 * como media, mediana, máximo y mínimo.
 * @author David Addya Ruiz
 * @version 1.0
 */
public class Statistics {

  /**
   * Calcula el valor máximo de un array de números.
   *
   * @param arrayOfNumbers Array de números decimales.
   * @return El valor más alto encontrado en el array.
   * @throws IllegalArgumentException Si el array está vacío.
   */
  public double maximumValue(double[] arrayOfNumbers) {
    if (arrayOfNumbers.length == 0) {
      throw new IllegalArgumentException("Array must not be empty");
    }
    double max = arrayOfNumbers[0];
    for (int i = 1; i < arrayOfNumbers.length; i++) {
      if (arrayOfNumbers[i] > max) {
        max = arrayOfNumbers[i];
      }
    }
    return max;
  }
  /**
   * Calcula el valor mínimo de un array de números.
   *
   * @param arrayOfNumbers Array de números decimales.
   * @return El valor más bajo encontrado en el array.
   * @throws IllegalArgumentException Si el array está vacío.
   */
  public double minimumValue(double[] arrayOfNumbers) {
    if (arrayOfNumbers.length == 0) {
      throw new IllegalArgumentException("Array must not be empty");
    }
    double min = arrayOfNumbers[0];
    for (int i = 1; i < arrayOfNumbers.length; i++) {
      if (arrayOfNumbers[i] < min) {
        min = arrayOfNumbers[i];
      }
    }
    return min;
  }
  /**
   * Calcula la media aritmética de un conjunto de números.
   *
   * @param arrayOfNumbers Array de números decimales.
   * @return El promedio de los valores del array.
   * @throws IllegalArgumentException Si el array está vacío.
   */
  public double mean(double[] arrayOfNumbers) {
    if (arrayOfNumbers.length == 0) {
      throw new IllegalArgumentException("Array must not be empty");
    }
    double sum = 0.0;
    for (double num : arrayOfNumbers) {
      sum += num;
    }
    return sum / arrayOfNumbers.length;
  }
  public void methodAddedByOwner() {
    System.out.println("Method added by the owner");
  }
}
