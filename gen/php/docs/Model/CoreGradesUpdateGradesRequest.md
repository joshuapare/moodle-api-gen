# # CoreGradesUpdateGradesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityid** | **int** | The activity ID | [default to null]
**component** | **string** | A component, for example mod_forum or mod_quiz | [default to 'null']
**courseid** | **int** | id of course |
**grades** | [**\OpenAPI\Client\Model\CoreGradesUpdateGradesRequestGradesInner[]**](CoreGradesUpdateGradesRequestGradesInner.md) |  | [optional]
**itemdetails** | [**\OpenAPI\Client\Model\CoreGradesUpdateGradesRequestItemdetails**](CoreGradesUpdateGradesRequestItemdetails.md) |  | [optional]
**itemnumber** | **int** | grade item ID number for modules that have multiple grades. Typically this is 0. | [default to null]
**source** | **string** | The source of the grade update | [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
