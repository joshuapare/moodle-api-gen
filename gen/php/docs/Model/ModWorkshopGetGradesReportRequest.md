# # ModWorkshopGetGradesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupid** | **int** | Group id, 0 means that the function will determine the user group. | [optional] [default to 0]
**page** | **int** | The page of records to return. | [optional] [default to 0]
**perpage** | **int** | The number of records to return per page. | [optional] [default to 0]
**sortby** | **string** | sort by this element: lastname, firstname, submissiontitle,                     submissionmodified, submissiongrade, gradinggrade. | [optional] [default to 'lastname']
**sortdirection** | **string** | sort direction: ASC or DESC | [optional] [default to 'ASC']
**workshopid** | **int** | Workshop instance id. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
