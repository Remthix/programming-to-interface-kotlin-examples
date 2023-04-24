package patterns

data class Task(val id: String, val title: String, val description: String, val completed: Boolean)

interface TaskRepository {
    fun getTask(id: String): Task?
    fun addTask(task: Task): Task
    fun updateTask(task: Task): Task
    fun deleteTask(id: String): Boolean
    fun getAllTasks(): List<Task>
}

class InMemoryTaskRepository : TaskRepository {
    // Implementation details...
    override fun getTask(id: String): Task? {
        TODO("Not yet implemented")
    }

    override fun addTask(task: Task): Task {
        TODO("Not yet implemented")
    }

    override fun updateTask(task: Task): Task {
        TODO("Not yet implemented")
    }

    override fun deleteTask(id: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun getAllTasks(): List<Task> {
        TODO("Not yet implemented")
    }
}

class LocalDatabaseTaskRepository : TaskRepository {
    // Implementation details...
    override fun getTask(id: String): Task? {
        TODO("Not yet implemented")
    }

    override fun addTask(task: Task): Task {
        TODO("Not yet implemented")
    }

    override fun updateTask(task: Task): Task {
        TODO("Not yet implemented")
    }

    override fun deleteTask(id: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun getAllTasks(): List<Task> {
        TODO("Not yet implemented")
    }
}

class CloudDatabaseTaskRepository : TaskRepository {
    // Implementation details...
    override fun getTask(id: String): Task? {
        TODO("Not yet implemented")
    }

    override fun addTask(task: Task): Task {
        TODO("Not yet implemented")
    }

    override fun updateTask(task: Task): Task {
        TODO("Not yet implemented")
    }

    override fun deleteTask(id: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun getAllTasks(): List<Task> {
        TODO("Not yet implemented")
    }
}
