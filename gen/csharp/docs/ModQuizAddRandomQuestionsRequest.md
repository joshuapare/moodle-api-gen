# Org.OpenAPITools.Model.ModQuizAddRandomQuestionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Addonpage** | **int** | The page where random questions will be added to | [default to null]
**Cmid** | **int** | The cmid of the quiz | [default to null]
**Filtercondition** | **string** | (Optional) The filter condition used when adding random questions from an existing category.                     Not required if adding random questions from a new category. | [optional] [default to ""]
**Newcategory** | **string** | (Optional) The name of a new question category to create and use for the random questions. | [optional] [default to ""]
**Parentcategory** | **string** | (Optional) The parent of the new question category, if creating one. | [optional] [default to "0"]
**Randomcount** | **int** | Number of random questions | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

