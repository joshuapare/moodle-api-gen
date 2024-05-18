# ModWorkshopGetGradesReport200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Report** | [**ModWorkshopGetGradesReport200ResponseReport**](ModWorkshopGetGradesReport200ResponseReport.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWorkshopGetGradesReport200Response

`func NewModWorkshopGetGradesReport200Response(report ModWorkshopGetGradesReport200ResponseReport, ) *ModWorkshopGetGradesReport200Response`

NewModWorkshopGetGradesReport200Response instantiates a new ModWorkshopGetGradesReport200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetGradesReport200ResponseWithDefaults

`func NewModWorkshopGetGradesReport200ResponseWithDefaults() *ModWorkshopGetGradesReport200Response`

NewModWorkshopGetGradesReport200ResponseWithDefaults instantiates a new ModWorkshopGetGradesReport200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReport

`func (o *ModWorkshopGetGradesReport200Response) GetReport() ModWorkshopGetGradesReport200ResponseReport`

GetReport returns the Report field if non-nil, zero value otherwise.

### GetReportOk

`func (o *ModWorkshopGetGradesReport200Response) GetReportOk() (*ModWorkshopGetGradesReport200ResponseReport, bool)`

GetReportOk returns a tuple with the Report field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReport

`func (o *ModWorkshopGetGradesReport200Response) SetReport(v ModWorkshopGetGradesReport200ResponseReport)`

SetReport sets Report field to given value.


### GetWarnings

`func (o *ModWorkshopGetGradesReport200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWorkshopGetGradesReport200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWorkshopGetGradesReport200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWorkshopGetGradesReport200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


