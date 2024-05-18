# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.core_competency_read_user_evidence200_response_competencies_inner import CoreCompetencyReadUserEvidence200ResponseCompetenciesInner
from openapi_client.models.core_competency_read_user_evidence200_response_files_inner import CoreCompetencyReadUserEvidence200ResponseFilesInner
from typing import Optional, Set
from typing_extensions import Self

class CoreCompetencyReadUserEvidence200Response(BaseModel):
    """
    CoreCompetencyReadUserEvidence200Response
    """ # noqa: E501
    canmanage: StrictBool = Field(description="canmanage")
    competencies: List[CoreCompetencyReadUserEvidence200ResponseCompetenciesInner]
    competencycount: StrictInt = Field(description="competencycount")
    description: StrictStr = Field(description="description")
    descriptionformat: Optional[StrictInt] = Field(default=1, description="description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    filecount: StrictInt = Field(description="filecount")
    files: List[CoreCompetencyReadUserEvidence200ResponseFilesInner]
    hasurlorfiles: StrictBool = Field(description="hasurlorfiles")
    id: StrictInt = Field(description="id")
    name: StrictStr = Field(description="name")
    timecreated: StrictInt = Field(description="timecreated")
    timemodified: StrictInt = Field(description="timemodified")
    url: StrictStr = Field(description="url")
    urlshort: StrictStr = Field(description="urlshort")
    userid: StrictInt = Field(description="userid")
    usermodified: StrictInt = Field(description="usermodified")
    __properties: ClassVar[List[str]] = ["canmanage", "competencies", "competencycount", "description", "descriptionformat", "filecount", "files", "hasurlorfiles", "id", "name", "timecreated", "timemodified", "url", "urlshort", "userid", "usermodified"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of CoreCompetencyReadUserEvidence200Response from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in competencies (list)
        _items = []
        if self.competencies:
            for _item in self.competencies:
                if _item:
                    _items.append(_item.to_dict())
            _dict['competencies'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in files (list)
        _items = []
        if self.files:
            for _item in self.files:
                if _item:
                    _items.append(_item.to_dict())
            _dict['files'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreCompetencyReadUserEvidence200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "canmanage": obj.get("canmanage"),
            "competencies": [CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.from_dict(_item) for _item in obj["competencies"]] if obj.get("competencies") is not None else None,
            "competencycount": obj.get("competencycount") if obj.get("competencycount") is not None else null,
            "description": obj.get("description") if obj.get("description") is not None else '',
            "descriptionformat": obj.get("descriptionformat") if obj.get("descriptionformat") is not None else 1,
            "filecount": obj.get("filecount") if obj.get("filecount") is not None else null,
            "files": [CoreCompetencyReadUserEvidence200ResponseFilesInner.from_dict(_item) for _item in obj["files"]] if obj.get("files") is not None else None,
            "hasurlorfiles": obj.get("hasurlorfiles") if obj.get("hasurlorfiles") is not None else False,
            "id": obj.get("id") if obj.get("id") is not None else 0,
            "name": obj.get("name"),
            "timecreated": obj.get("timecreated") if obj.get("timecreated") is not None else 0,
            "timemodified": obj.get("timemodified") if obj.get("timemodified") is not None else 0,
            "url": obj.get("url") if obj.get("url") is not None else '',
            "urlshort": obj.get("urlshort") if obj.get("urlshort") is not None else 'null',
            "userid": obj.get("userid"),
            "usermodified": obj.get("usermodified") if obj.get("usermodified") is not None else 0
        })
        return _obj

