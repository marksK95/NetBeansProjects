/*public static void firstMethod(int [] A) {

int j, i, tmp;

for (i = 0; i<A.length/2; i++) {

boolean swapped = false;

for ( j = i; j<A.length - i - 1; j++) {

if (A[j] >A[j+1]) {

tmp = A[j];

A[j] = A[j+1];

A[j+1] = tmp;

swapped = true;

}

}

for ( j = A.length - 2 - i; j>i; j--) {

if (A[j] <A[j-1]) {

tmp = A[j];

A[j] = A[j-1];

A[j-1] = tmp;

swapped = true;

}

}

if(!swapped) break;

}

}



public static void secondMethod(int [] A){

int  j, i, increment, temp;


increment = A.length / 2;

while (increment> 0) {

for ( i = increment; i<A.length; i++) {

j = i;

temp = A[i];

while (j>= increment&&A[j - increment] >temp) {

A[j] = A[j - increment];

j = j - increment;

}

A[j] = temp;

}

if (increment == 2) {

increment = 1;

} else {

increment *= (5.0 / 11);

}

}}
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
public static void firstMethod(int [] A) {

int j, i, tmp;

for (i = 0; i<A.length/2; i++) {

boolean swapped = false;

for ( j = i; j<A.length - i - 1; j++) {

if (A[j] >A[j+1]) {

tmp = A[j];

A[j] = A[j+1];

A[j+1] = tmp;

swapped = true;

}

}

for ( j = A.length - 2 - i; j>i; j--) {

if (A[j] <A[j-1]) {

tmp = A[j];

A[j] = A[j-1];

A[j-1] = tmp;

swapped = true;

}

}

if(!swapped) break;

}

}



public static void secondMethod(int [] A){

int  j, i, increment, temp;


increment = A.length / 2;

while (increment> 0) {

for ( i = increment; i<A.length; i++) {

j = i;

temp = A[i];

while (j>= increment&&A[j - increment] >temp) {

A[j] = A[j - increment];

j = j - increment;

}

A[j] = temp;

}

if (increment == 2) {

increment = 1;

} else {

increment *= (5.0 / 11);

}

}}
/**
 *
 * @author HOME
 */
public class JavaApplication2 {
public static void firstMethod(int [] A) {

int j, i, tmp;

for (i = 0; i<A.length/2; i++) {

boolean swapped = false;

for ( j = i; j<A.length - i - 1; j++) {

if (A[j] >A[j+1]) {

tmp = A[j];

A[j] = A[j+1];

A[j+1] = tmp;

swapped = true;

}

}

for ( j = A.length - 2 - i; j>i; j--) {

if (A[j] <A[j-1]) {

tmp = A[j];

A[j] = A[j-1];

A[j-1] = tmp;

swapped = true;

}

}

if(!swapped) break;

}

}



public static void secondMethod(int [] A){

int  j, i, increment, temp;


increment = A.length / 2;

while (increment> 0) {

for ( i = increment; i<A.length; i++) {

j = i;

temp = A[i];

while (j>= increment&&A[j - increment] >temp) {

A[j] = A[j - increment];

j = j - increment;

}

A[j] = temp;

}

if (increment == 2) {

increment = 1;

} else {

increment *= (5.0 / 11);

}

}}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
