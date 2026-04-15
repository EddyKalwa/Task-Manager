package com.example.todolist.ui.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.todolist.data.local.TaskDatabase
import com.example.todolist.data.repository.TaskRepository
import com.example.todolist.ui.TaskScreen
import com.example.todolist.ui.TaskDetailScreen
import com.example.todolist.viewModel.TaskViewModel
import com.example.todolist.viewModel.ViewModelFactory

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavigationGraph() {
    val context = LocalContext.current
    val database = TaskDatabase.getDatabase(context)
    val repository = TaskRepository(database.taskDao())
    val viewModel: TaskViewModel = viewModel(factory = ViewModelFactory(repository))

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            TaskScreen(navController, viewModel)
        }
        composable("task_detail/{taskId}") { backStackEntry ->
            val taskId = backStackEntry.arguments?.getString("taskId")
            taskId?.let {
                TaskDetailScreen(navController, it.toInt(), viewModel)
            }
        }
    }
}
