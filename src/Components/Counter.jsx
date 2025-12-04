import { useState } from "react";

function Counter(){
    const [c,s]=useState(0);
    return(
<div>
        <h2>Count: {c}</h2>
        <button onClick={()=>s(c+3)}>Click</button>
</div>
    );
}
export default Counter;