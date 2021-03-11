<div class="login">
    <form class="loginForm">
        <div class="loginTitle">
            <h1>Log in</h1>
        </div>
        <label>
            <p>Email</p>
            <input type="email"/ class="textBox">
        </label>
        <label>
            <p>Password</p>
            <input type="password" class="textBox"/>
        </label>
        <button type="submit">
            Log in
        </button>
    </form>
</div>

<style>
@import url('https://fonts.googleapis.com/css2?family=Inter:wght@400;700&display=swap');
body {
    font-family: 'Inter', sans-serif;
    background: linear-gradient(20deg, #e66465, #9198e5);
    background-repeat: no-repeat;
    background-attachment: fixed;
}

.login {
    position: relative;
    left: 50%;
    transform: translate(-50%, 50%);
    background-color: rgba(222, 219, 211, 0.3);
    color: black;
    width: 30rem;
    height: 20rem;
    border-radius: 10px;
}

.loginForm {
    position: absolute;
    margin: 20px;
}

.loginTitle {
    color: black;
    letter-spacing: 1px;
}

input[type='email'], input[type='password'] {
    font-family: inherit;
    -webkit-appearance: none;
    -moz-appearance: none;
    background: rgba(255, 255, 255, 0.2);
    outline: none;
    border: none;
    border-radius: 6px;
    height: 1.3rem;
    padding-left: 0.5rem;
    color: black;
}

input[type='email']:focus, input[type='password']:focus {
    background: rgba(255, 255, 255, 0.3);
    border: none;
}

button[type="submit"] {
    border: none;
    height: 2rem;
    width: 5rem;
    border-radius: 20px;
    outline: none;
    background: rgba(1, 1, 1);
    font-family: inherit;
    letter-spacing: 1px;
    color: white;
}
</style>