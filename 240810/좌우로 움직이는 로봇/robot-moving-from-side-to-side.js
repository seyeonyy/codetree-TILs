const readline = require('readline');


function get_position_array(position_array, move_array){
    let array_length = 0;
    position_array[array_length] = 0;
    for (let i = 0; i < move_array.length; i++) {
        let [t,d] = move_array[i];
        for (let j =0; j < t; ++j){
            array_length += 1;
            if (d < 0){
                position_array[array_length] = position_array[array_length-1] - 1;
            }
            else{
                position_array[array_length] = position_array[array_length-1] + 1;
            }

            
        }
    }

    return [position_array, array_length]
}


function countCollisions(n, m, movesA, movesB) {
    let A_position = new Array(50000).fill(-1000000);
    let B_position = new Array(50000).fill(-1000000);
    let collisions = 0;
    let a_length = 0;
    let b_length = 0;
    [A_position, a_length] = get_position_array(A_position, movesA);
    [B_position, b_length] = get_position_array(B_position, movesB);
    let max_length = Math.max(a_length, b_length);
    let is_same_position = true;
    for(let i =0; i < max_length; i++){
        if (A_position[i] == -1000000){
            A_position[i] = A_position[i-1];
        }
        if (B_position[i] == -1000000){
            B_position[i] = B_position[i-1];
        }
        if (A_position[i] === B_position[i]){
            if (is_same_position){
                continue;
            }
            else{
                collisions += 1;
                is_same_position = true;
            }
        }
        else {
            is_same_position = false;
        }
    }
   


    return collisions;
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


let input = '';

rl.on('line', (line) => {
    input += line + '\n';
}).on('close', () => {
    const lines = input.trim().split('\n');
    const [n, m] = lines[0].split(' ').map(Number);
    const movesA = lines.slice(1, n + 1).map(line => {
    const [t, d] = line.split(' ');
    return [Number(t), d === 'L' ? -Number(t) : Number(t)];
});

    const movesB = lines.slice(n + 1).map(line => {
    const [t, d] = line.split(' ');
    return [Number(t), d === 'L' ? -Number(t) : Number(t)];
});

    const result = countCollisions(n, m, movesA, movesB);
    console.log(result);
    process.exit();
});