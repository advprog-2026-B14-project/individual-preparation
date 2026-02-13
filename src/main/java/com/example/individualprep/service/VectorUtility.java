package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class VectorUtility {
    
    public double[] add(double[] v1, double[] v2) {
        // TODO: Implement me properly!
        return new double[] { 0.0, 0.0, 0.0 };
    }

    public double[] subtract(double[] v1, double[] v2) {
        // TODO: Implement me properly!
        return new double[] { 0.0, 0.0, 0.0 };
    }

    public double[] multiply(double[] v1, int x) {
        // TODO: Implement me properly!
        return new double[] { 0.0, 0.0, 0.0 };
    }
    
    public double dotProduct(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vektor harus memiliki panjang yang sama.");
        }

        double total = 0;
        for (int i = 0; i < v1.length; i++) {
            total += v1[i] * v2[i];
        }

        return total;
    }
    
    public double norm(double[] v1) {
        double sumOfSquares = 0.0;
        for (double value : v1){
            sumOfSquares += value * value;
        }
        return Math.sqrt(sumOfSquares);
    }
}