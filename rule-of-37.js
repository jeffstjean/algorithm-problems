// Rule of 37 proof - Javascript

const NUMBER_OF_ITERATIONS = 5;
const NUMBER_OF_SAMPLES = 50000;
const NUMBER_OF_ITEMS = 10;

for(var i = 0; i < NUMBER_OF_ITERATIONS; i++) {
    var numberOfTimesRight = 0;
    for(var j = 0; j < NUMBER_OF_SAMPLES; j++) {
        let nums = [];
        nums = generate(nums, NUMBER_OF_ITEMS);
        var best = look(nums)
        var selection = select(nums, best);
        if(selection === NUMBER_OF_ITEMS) numberOfTimesRight++;
    }
    print('Iteration ' + (i+1) + ': ' + Math.round(numberOfTimesRight/NUMBER_OF_SAMPLES*100) + '%');
}

function generate(nums, size) {
    while(nums.length < size) {
        var num = Math.ceil(Math.random() * Math.floor(size)); 
        if(nums.indexOf(num) === -1) nums.push(num);
    }
    return nums
}

function look(nums) {
    const STOPPING_POINT = Math.floor(nums.length*0.37);
    var best = 0;
    for(var i = 0; i < STOPPING_POINT; i++) best = Math.max(best, nums[i]);
    return best;
}

function select(nums, best) {
    const STOPPING_POINT = Math.floor(nums.length*0.37);
    var selection;
    for(var i = STOPPING_POINT; i < nums.length; i++) {
        if(i === nums.length - 1) selection = nums[i];
        if(nums[i] > best) {
            selection = nums[i];
            break;
        }
    }
    return selection;
}
