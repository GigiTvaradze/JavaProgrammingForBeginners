package section11PrimitiveDataTypesAndAlternatives;

/**
 * In Java, float, double, and BigDecimal are used for handling decimal numbers, but they differ in precision, storage, and use cases.
 */

/**
 * float (32-bit)
 *
 * Single-precision (stores 32 bits).
 * Less accurate due to rounding errors.
 * Suitable for approximate calculations where precision is not critical.
 * Example: float num = 3.14f;
 */

/**
 *  double (64-bit)
 *
 *  Double-precision (stores 64 bits).
 *  More precise than float, but still has rounding issues.
 *  Commonly used for scientific and mathematical computations.
 *  Example: double num = 3.1415926535;
 */

/**
 * BigDecimal
 *
 * Provides arbitrary precision.
 * Used when high precision is required (e.g., financial calculations).
 * Slower than float and double due to higher memory and processing overhead.
 *
 * BigDecimal num = new BigDecimal("3.14159265358979323846");
 */
public class BigDecimalClass { }