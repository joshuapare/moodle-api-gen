# CoreGradesGetGradeitems200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GradeItems** | [**[]CoreGradesGetGradeitems200ResponseGradeItemsInner**](CoreGradesGetGradeitems200ResponseGradeItemsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreGradesGetGradeitems200Response

`func NewCoreGradesGetGradeitems200Response(gradeItems []CoreGradesGetGradeitems200ResponseGradeItemsInner, ) *CoreGradesGetGradeitems200Response`

NewCoreGradesGetGradeitems200Response instantiates a new CoreGradesGetGradeitems200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGetGradeitems200ResponseWithDefaults

`func NewCoreGradesGetGradeitems200ResponseWithDefaults() *CoreGradesGetGradeitems200Response`

NewCoreGradesGetGradeitems200ResponseWithDefaults instantiates a new CoreGradesGetGradeitems200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGradeItems

`func (o *CoreGradesGetGradeitems200Response) GetGradeItems() []CoreGradesGetGradeitems200ResponseGradeItemsInner`

GetGradeItems returns the GradeItems field if non-nil, zero value otherwise.

### GetGradeItemsOk

`func (o *CoreGradesGetGradeitems200Response) GetGradeItemsOk() (*[]CoreGradesGetGradeitems200ResponseGradeItemsInner, bool)`

GetGradeItemsOk returns a tuple with the GradeItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeItems

`func (o *CoreGradesGetGradeitems200Response) SetGradeItems(v []CoreGradesGetGradeitems200ResponseGradeItemsInner)`

SetGradeItems sets GradeItems field to given value.


### GetWarnings

`func (o *CoreGradesGetGradeitems200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreGradesGetGradeitems200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreGradesGetGradeitems200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreGradesGetGradeitems200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


