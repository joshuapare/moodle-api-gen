# ModWorkshopGetSubmissionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupid** | Option<**i32**> | Group id, 0 means that the function will determine the user group.                                                    It will return submissions done by users in the given group. | [optional][default to 0]
**page** | Option<**i32**> | The page of records to return. | [optional][default to 0]
**perpage** | Option<**i32**> | The number of records to return per page. | [optional][default to 0]
**userid** | Option<**i32**> | Get submissions done by this user. Use 0 or empty for the current user | [optional][default to 0]
**workshopid** | **i32** | Workshop instance id. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


