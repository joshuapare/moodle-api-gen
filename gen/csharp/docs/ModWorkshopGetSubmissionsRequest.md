# MoodleClient.Model.ModWorkshopGetSubmissionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groupid** | **int** | Group id, 0 means that the function will determine the user group.                                                    It will return submissions done by users in the given group. | [optional] [default to 0]
**Page** | **int** | The page of records to return. | [optional] [default to 0]
**Perpage** | **int** | The number of records to return per page. | [optional] [default to 0]
**Userid** | **int** | Get submissions done by this user. Use 0 or empty for the current user | [optional] [default to 0]
**Workshopid** | **int** | Workshop instance id. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

