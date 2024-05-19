# ModWorkshopGetGradesReport200ResponseReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Grades** | [**[]ModWorkshopGetGradesReport200ResponseReportGradesInner**](ModWorkshopGetGradesReport200ResponseReportGradesInner.md) |  | 
**Totalcount** | **int32** | Number of total submissions. | [default to null]

## Methods

### NewModWorkshopGetGradesReport200ResponseReport

`func NewModWorkshopGetGradesReport200ResponseReport(grades []ModWorkshopGetGradesReport200ResponseReportGradesInner, totalcount int32, ) *ModWorkshopGetGradesReport200ResponseReport`

NewModWorkshopGetGradesReport200ResponseReport instantiates a new ModWorkshopGetGradesReport200ResponseReport object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetGradesReport200ResponseReportWithDefaults

`func NewModWorkshopGetGradesReport200ResponseReportWithDefaults() *ModWorkshopGetGradesReport200ResponseReport`

NewModWorkshopGetGradesReport200ResponseReportWithDefaults instantiates a new ModWorkshopGetGradesReport200ResponseReport object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGrades

`func (o *ModWorkshopGetGradesReport200ResponseReport) GetGrades() []ModWorkshopGetGradesReport200ResponseReportGradesInner`

GetGrades returns the Grades field if non-nil, zero value otherwise.

### GetGradesOk

`func (o *ModWorkshopGetGradesReport200ResponseReport) GetGradesOk() (*[]ModWorkshopGetGradesReport200ResponseReportGradesInner, bool)`

GetGradesOk returns a tuple with the Grades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrades

`func (o *ModWorkshopGetGradesReport200ResponseReport) SetGrades(v []ModWorkshopGetGradesReport200ResponseReportGradesInner)`

SetGrades sets Grades field to given value.


### GetTotalcount

`func (o *ModWorkshopGetGradesReport200ResponseReport) GetTotalcount() int32`

GetTotalcount returns the Totalcount field if non-nil, zero value otherwise.

### GetTotalcountOk

`func (o *ModWorkshopGetGradesReport200ResponseReport) GetTotalcountOk() (*int32, bool)`

GetTotalcountOk returns a tuple with the Totalcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalcount

`func (o *ModWorkshopGetGradesReport200ResponseReport) SetTotalcount(v int32)`

SetTotalcount sets Totalcount field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


