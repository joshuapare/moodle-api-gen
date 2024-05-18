# # CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classification** | **string** | future, inprogress, or past |
**customfieldname** | **string** | Used when classification &#x3D; customfield | [optional]
**customfieldvalue** | **string** | Used when classification &#x3D; customfield | [optional]
**eventsfrom** | **int** | Optional starting timestamp for action events | [optional] [default to null]
**eventsto** | **int** | Optional ending timestamp for action events | [optional] [default to null]
**limit** | **int** | Result set limit | [optional] [default to 0]
**offset** | **int** | Result set offset | [optional] [default to 0]
**searchvalue** | **string** | The value a user wishes to search against | [optional]
**sort** | **string** | Sort string | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
