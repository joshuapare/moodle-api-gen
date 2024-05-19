# MoodleClient.Model.ModWorkshopGetGradesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groupid** | **int** | Group id, 0 means that the function will determine the user group. | [optional] [default to 0]
**Page** | **int** | The page of records to return. | [optional] [default to 0]
**Perpage** | **int** | The number of records to return per page. | [optional] [default to 0]
**Sortby** | **string** | sort by this element: lastname, firstname, submissiontitle,                     submissionmodified, submissiongrade, gradinggrade. | [optional] [default to "lastname"]
**Sortdirection** | **string** | sort direction: ASC or DESC | [optional] [default to "ASC"]
**Workshopid** | **int** | Workshop instance id. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

