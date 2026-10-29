
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Java Calculator</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f1f5f9;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }

        .calculator {
            background: white;
            width: 350px;
            padding: 28px;
            border-radius: 12px;
            box-shadow: 0 5px 20px #00000020;
        }

        h2 {
            text-align: center;
            color: #1e293b;
        }

        label {
            display: block;
            margin-top: 15px;
            margin-bottom: 6px;
        }

        input, select, button {
            box-sizing: border-box;
            width: 100%;
            padding: 11px;
            font-size: 16px;
            border-radius: 6px;
        }

        input, select {
            border: 1px solid #cbd5e1;
        }

        button {
            margin-top: 22px;
            background: #2563eb;
            color: white;
            border: none;
            cursor: pointer;
        }

        button:hover {
            background: #1d4ed8;
        }

        .note {
            text-align: center;
            color: #64748b;
            font-size: 13px;
            margin-top: 18px;
        }
    </style>
</head>

<body>
    <div class="calculator">
        <h2>Java Calculator</h2>

        <form action="calculate" method="post">

            <label for="num1">First Number</label>
            <input type="number" id="num1" name="num1"
                   step="any" required>

            <label for="num2">Second Number</label>
            <input type="number" id="num2" name="num2"
                   step="any" required>

            <label for="operation">Select Operation</label>
            <select id="operation" name="operation">
                <option value="add">Addition (+)</option>
                <option value="subtract">Subtraction (-)</option>
                <option value="multiply">Multiplication (*)</option>
                <option value="divide">Division (/)</option>
            </select>

            <button type="submit">Calculate Result</button>
        </form>

        <p class="note">
            Calculations are performed by Java Servlet.
        </p>
    </div>
</body>
</html>
