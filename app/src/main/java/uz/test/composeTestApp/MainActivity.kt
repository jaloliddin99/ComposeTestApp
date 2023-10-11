package uz.test.composeTestApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.test.composeTestApp.ui.theme.ComposeTestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                        item(span = { GridItemSpan(2) }) {
                            TopItem()
                        }


//                        items(20) {
//                            Row(
//                                modifier = Modifier.horizontalScroll(rememberScrollState())
//                            ) {
//                                TopRow()
//                            }
//                        }
                        items(20) {
                            BottomColumn()
                        }

                        //this is just comment
                        //this is second just comment



                        //this was my changes


                    }
                }
            }
        }
    }
}

@Composable
fun TopItem() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .width(100.dp),
    ) {
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
        ) {
            for (i in 0..20) {
                TopRow()
            }
        }
    }
}

@Composable
fun TopRow() {
    OutlinedCard(
        modifier = Modifier
            .height(150.dp)
            .width(100.dp),
        shape = ShapeDefaults.Medium
    ) {


    }
}

@Composable
fun BottomColumn() {
    OutlinedCard(
        modifier = Modifier
            .height(200.dp)
            .aspectRatio(0.7f),
        shape = ShapeDefaults.Medium,
        colors = CardDefaults.cardColors(
            containerColor = Color.Green
        )
    ) {

    }
}