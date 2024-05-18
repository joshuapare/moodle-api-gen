# # ModWorkshopGetSubmissionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupid** | **int** | Group id, 0 means that the function will determine the user group.                                                    It will return submissions done by users in the given group. | [optional] [default to 0]
**page** | **int** | The page of records to return. | [optional] [default to 0]
**perpage** | **int** | The number of records to return per page. | [optional] [default to 0]
**userid** | **int** | Get submissions done by this user. Use 0 or empty for the current user | [optional] [default to 0]
**workshopid** | **int** | Workshop instance id. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
