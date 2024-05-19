# GradereportUserGetGradesTable200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tables** | [**[]GradereportUserGetGradesTable200ResponseTablesInner**](GradereportUserGetGradesTable200ResponseTablesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewGradereportUserGetGradesTable200Response

`func NewGradereportUserGetGradesTable200Response(tables []GradereportUserGetGradesTable200ResponseTablesInner, ) *GradereportUserGetGradesTable200Response`

NewGradereportUserGetGradesTable200Response instantiates a new GradereportUserGetGradesTable200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGradereportUserGetGradesTable200ResponseWithDefaults

`func NewGradereportUserGetGradesTable200ResponseWithDefaults() *GradereportUserGetGradesTable200Response`

NewGradereportUserGetGradesTable200ResponseWithDefaults instantiates a new GradereportUserGetGradesTable200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTables

`func (o *GradereportUserGetGradesTable200Response) GetTables() []GradereportUserGetGradesTable200ResponseTablesInner`

GetTables returns the Tables field if non-nil, zero value otherwise.

### GetTablesOk

`func (o *GradereportUserGetGradesTable200Response) GetTablesOk() (*[]GradereportUserGetGradesTable200ResponseTablesInner, bool)`

GetTablesOk returns a tuple with the Tables field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTables

`func (o *GradereportUserGetGradesTable200Response) SetTables(v []GradereportUserGetGradesTable200ResponseTablesInner)`

SetTables sets Tables field to given value.


### GetWarnings

`func (o *GradereportUserGetGradesTable200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *GradereportUserGetGradesTable200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *GradereportUserGetGradesTable200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *GradereportUserGetGradesTable200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


