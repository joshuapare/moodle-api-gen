# ModWorkshopGetGradesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groupid** | Pointer to **int32** | Group id, 0 means that the function will determine the user group. | [optional] [default to 0]
**Page** | Pointer to **int32** | The page of records to return. | [optional] [default to 0]
**Perpage** | Pointer to **int32** | The number of records to return per page. | [optional] [default to 0]
**Sortby** | Pointer to **string** | sort by this element: lastname, firstname, submissiontitle,                     submissionmodified, submissiongrade, gradinggrade. | [optional] [default to "lastname"]
**Sortdirection** | Pointer to **string** | sort direction: ASC or DESC | [optional] [default to "ASC"]
**Workshopid** | **int32** | Workshop instance id. | 

## Methods

### NewModWorkshopGetGradesReportRequest

`func NewModWorkshopGetGradesReportRequest(workshopid int32, ) *ModWorkshopGetGradesReportRequest`

NewModWorkshopGetGradesReportRequest instantiates a new ModWorkshopGetGradesReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetGradesReportRequestWithDefaults

`func NewModWorkshopGetGradesReportRequestWithDefaults() *ModWorkshopGetGradesReportRequest`

NewModWorkshopGetGradesReportRequestWithDefaults instantiates a new ModWorkshopGetGradesReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroupid

`func (o *ModWorkshopGetGradesReportRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModWorkshopGetGradesReportRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModWorkshopGetGradesReportRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModWorkshopGetGradesReportRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetPage

`func (o *ModWorkshopGetGradesReportRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModWorkshopGetGradesReportRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModWorkshopGetGradesReportRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModWorkshopGetGradesReportRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *ModWorkshopGetGradesReportRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *ModWorkshopGetGradesReportRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *ModWorkshopGetGradesReportRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *ModWorkshopGetGradesReportRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetSortby

`func (o *ModWorkshopGetGradesReportRequest) GetSortby() string`

GetSortby returns the Sortby field if non-nil, zero value otherwise.

### GetSortbyOk

`func (o *ModWorkshopGetGradesReportRequest) GetSortbyOk() (*string, bool)`

GetSortbyOk returns a tuple with the Sortby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortby

`func (o *ModWorkshopGetGradesReportRequest) SetSortby(v string)`

SetSortby sets Sortby field to given value.

### HasSortby

`func (o *ModWorkshopGetGradesReportRequest) HasSortby() bool`

HasSortby returns a boolean if a field has been set.

### GetSortdirection

`func (o *ModWorkshopGetGradesReportRequest) GetSortdirection() string`

GetSortdirection returns the Sortdirection field if non-nil, zero value otherwise.

### GetSortdirectionOk

`func (o *ModWorkshopGetGradesReportRequest) GetSortdirectionOk() (*string, bool)`

GetSortdirectionOk returns a tuple with the Sortdirection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortdirection

`func (o *ModWorkshopGetGradesReportRequest) SetSortdirection(v string)`

SetSortdirection sets Sortdirection field to given value.

### HasSortdirection

`func (o *ModWorkshopGetGradesReportRequest) HasSortdirection() bool`

HasSortdirection returns a boolean if a field has been set.

### GetWorkshopid

`func (o *ModWorkshopGetGradesReportRequest) GetWorkshopid() int32`

GetWorkshopid returns the Workshopid field if non-nil, zero value otherwise.

### GetWorkshopidOk

`func (o *ModWorkshopGetGradesReportRequest) GetWorkshopidOk() (*int32, bool)`

GetWorkshopidOk returns a tuple with the Workshopid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkshopid

`func (o *ModWorkshopGetGradesReportRequest) SetWorkshopid(v int32)`

SetWorkshopid sets Workshopid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


