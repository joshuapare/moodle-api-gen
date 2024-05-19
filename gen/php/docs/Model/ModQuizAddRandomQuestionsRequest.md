# # ModQuizAddRandomQuestionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addonpage** | **int** | The page where random questions will be added to | [default to null]
**cmid** | **int** | The cmid of the quiz | [default to null]
**filtercondition** | **string** | (Optional) The filter condition used when adding random questions from an existing category.                     Not required if adding random questions from a new category. | [optional] [default to '']
**newcategory** | **string** | (Optional) The name of a new question category to create and use for the random questions. | [optional] [default to '']
**parentcategory** | **string** | (Optional) The parent of the new question category, if creating one. | [optional] [default to '0']
**randomcount** | **int** | Number of random questions | [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
