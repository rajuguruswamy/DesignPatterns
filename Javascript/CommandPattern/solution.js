import AddCommand from './AddCommand.js';
import SubtractCommand from './SubtractCommand.js';
import MultiplyCommand from './MultiplyCommand.js';
import DivideCommand from './DivideCommand.js';
import AddThenMultiplyCommand from './AddThenMultiplyCommand.js';

import Calculator from './Calculator.js';

const calculator = new Calculator();
console.log('Before add value : ', calculator.value);
calculator.executeCommand(new AddCommand(10));
console.log('After add value 10 : ', calculator.value);

calculator.executeCommand(new MultiplyCommand(2));
console.log('After multiply value 2 : ', calculator.value);

calculator.undo();
console.log('Before undo : ', calculator.value);

console.log('\n -------AddThenMultiplyCommand -------------\n ');
const calculator1 = new Calculator();
console.log('Before add and multiply value : ', calculator1.value);
calculator1.executeCommand(new AddThenMultiplyCommand(15, 3));
console.log('After AddThenMultiplyCommand execute : ', calculator1.value);

calculator1.undo();
console.log('After AddThenMultiplyCommand undo : ', calculator1.value);
