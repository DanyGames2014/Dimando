# World Generation

## Dimando Ore
When Dimando is generated, each vein has its richness decided on a scale from 1 to 10 where 1-5 will be a poor vein, 6-8 will be a normal vein and 9-10 will be a rich vein.

The richness results in the vein sizes (Poor, Normal and Rich) are all evaluated in order from the rolled richness down to the lowest in that vein size. (For Example : If a Richness of 3 is rolled then a Poor Dimando Ore will spawn, then there is a 35% chance of another Poor Dimando Ore spawning and then there is a 65% of another Poor Dimando Ore spawning, in total there can be 3 poor dimando ores)

#### Poor Vein (50% chance)
The Poor vein always starts with a [Poor Dimando Ore](Blocks/Poor%20Dimando%20Ore.md) in the middle, whether more ores genereated will depend on the richness
<table>
	<tr>
		<th>Richness</th><th>Result</th>
	</tr>
	<tr>
		<td>1</td><td>No additional ores will be generated, leaving the vein as a single Poor Dimando Ore</td>
	</tr>
	<tr>
		<td>2</td><td>Adds a 35% chance to generate another Poor Dimando Ore</td>
	</tr>
	<tr>
		<td>3</td><td>Adds a 65% chance to generate another Poor Dimando Ore</td>
	</tr>
	<tr>
		<td>4</td><td>Adds a 90% chance to generate another Poor Dimando Ore</td>
	</tr>
	<tr>
		<td>5</td><td>Adds a 40% chance to generate a Dimando Ore</td>
	</tr>
</table>

#### Normal Vein (30% chance)
The Normal vein always starts with a [Dimando Ore](Blocks/Dimando%20Ore.md) in the middle
<table>
	<tr>
		<th>Richness</th><th>Result</th>
	</tr>
	<tr>
		<td>6</td><td>Generates a Dimando Ore with a 50% chance to generate a Poor Dimando Ore alongside it</td>
	</tr>
	<tr>
		<td>7</td><td>Adds a 35% chance to generate another Dimando Ore</td>
	</tr>
	<tr>
		<td>8</td><td>Adds a 75% chance to generate another Dimando Ore</td>
	</tr>
</table>

#### Rich Vein (20% chance)
The Rich vein always starts with a [Rich Dimando Ore](Blocks/Rich%20Dimando%20Ore.md) in the middle
<table>
	<tr>
		<th>Richness</th><th>Result</th>
	</tr>
	<tr>
		<td>9</td><td>Generates a Rich Dimando Ore with a 35% chance of generating a Dimando ore alongside it</td>
	</tr>
	<tr>
		<td>10</td><td>Adds a 75% chance to generate another Rich Dimando Ore</td>
	</tr>
</table>
