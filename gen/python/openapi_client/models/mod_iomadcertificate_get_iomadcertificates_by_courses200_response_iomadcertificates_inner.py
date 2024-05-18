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

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner(BaseModel):
    """
    Tool
    """ # noqa: E501
    bordercolor: Optional[StrictStr] = Field(default='null', description="Border color")
    borderstyle: Optional[StrictStr] = Field(default='null', description="Border style")
    course: Optional[StrictInt] = Field(default=None, description="Course id")
    coursemodule: Optional[StrictInt] = Field(default=None, description="Course module id")
    customtext: Optional[StrictStr] = Field(default='null', description="Custom text")
    datefmt: Optional[StrictInt] = Field(default=null, description="Date format")
    delivery: Optional[StrictInt] = Field(default=null, description="Delivery options")
    emailothers: Optional[StrictStr] = Field(default='null', description="Email others?")
    emailteachers: Optional[StrictInt] = Field(default=null, description="Email teachers?")
    gradefmt: Optional[StrictInt] = Field(default=null, description="Grade format")
    groupingid: Optional[StrictInt] = Field(default=None, description="group id")
    groupmode: Optional[StrictInt] = Field(default=null, description="group mode")
    id: Optional[StrictInt] = Field(default=null, description="Certificate id")
    intro: Optional[StrictStr] = Field(default='null', description="The Certificate intro")
    introformat: Optional[StrictInt] = Field(default=None, description="intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    iomadcertificatetype: Optional[StrictStr] = Field(default='null', description="Type")
    name: Optional[StrictStr] = Field(default='null', description="Certificate name")
    orientation: Optional[StrictStr] = Field(default='null', description="Orientation")
    printdate: Optional[StrictStr] = Field(default='null', description="Print date?")
    printgrade: Optional[StrictInt] = Field(default=null, description="Print grade?")
    printhours: Optional[StrictStr] = Field(default='null', description="Print hours?")
    printnumber: Optional[StrictInt] = Field(default=null, description="Print number?")
    printoutcome: Optional[StrictInt] = Field(default=null, description="Print outcome?")
    printseal: Optional[StrictStr] = Field(default='null', description="Print seal?")
    printsignature: Optional[StrictStr] = Field(default='null', description="Print signature?")
    printteacher: Optional[StrictInt] = Field(default=null, description="Print teacher?")
    printwmark: Optional[StrictStr] = Field(default='null', description="Print water mark?")
    reportcert: Optional[StrictInt] = Field(default=null, description="Report iomadcertificate?")
    requiredtime: Optional[StrictInt] = Field(default=null, description="Required time")
    requiredtimenotmet: Optional[StrictInt] = Field(default=null, description="Whether the time req is met")
    savecert: Optional[StrictInt] = Field(default=null, description="Save iomadcertificate?")
    section: Optional[StrictInt] = Field(default=None, description="course section id")
    timecreated: Optional[StrictInt] = Field(default=None, description="Time created")
    timemodified: Optional[StrictInt] = Field(default=None, description="Time modified")
    visible: Optional[StrictInt] = Field(default=None, description="visible")
    __properties: ClassVar[List[str]] = ["bordercolor", "borderstyle", "course", "coursemodule", "customtext", "datefmt", "delivery", "emailothers", "emailteachers", "gradefmt", "groupingid", "groupmode", "id", "intro", "introformat", "iomadcertificatetype", "name", "orientation", "printdate", "printgrade", "printhours", "printnumber", "printoutcome", "printseal", "printsignature", "printteacher", "printwmark", "reportcert", "requiredtime", "requiredtimenotmet", "savecert", "section", "timecreated", "timemodified", "visible"]

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
        """Create an instance of ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "bordercolor": obj.get("bordercolor") if obj.get("bordercolor") is not None else 'null',
            "borderstyle": obj.get("borderstyle") if obj.get("borderstyle") is not None else 'null',
            "course": obj.get("course"),
            "coursemodule": obj.get("coursemodule"),
            "customtext": obj.get("customtext") if obj.get("customtext") is not None else 'null',
            "datefmt": obj.get("datefmt") if obj.get("datefmt") is not None else null,
            "delivery": obj.get("delivery") if obj.get("delivery") is not None else null,
            "emailothers": obj.get("emailothers") if obj.get("emailothers") is not None else 'null',
            "emailteachers": obj.get("emailteachers") if obj.get("emailteachers") is not None else null,
            "gradefmt": obj.get("gradefmt") if obj.get("gradefmt") is not None else null,
            "groupingid": obj.get("groupingid"),
            "groupmode": obj.get("groupmode") if obj.get("groupmode") is not None else null,
            "id": obj.get("id") if obj.get("id") is not None else null,
            "intro": obj.get("intro") if obj.get("intro") is not None else 'null',
            "introformat": obj.get("introformat"),
            "iomadcertificatetype": obj.get("iomadcertificatetype") if obj.get("iomadcertificatetype") is not None else 'null',
            "name": obj.get("name") if obj.get("name") is not None else 'null',
            "orientation": obj.get("orientation") if obj.get("orientation") is not None else 'null',
            "printdate": obj.get("printdate") if obj.get("printdate") is not None else 'null',
            "printgrade": obj.get("printgrade") if obj.get("printgrade") is not None else null,
            "printhours": obj.get("printhours") if obj.get("printhours") is not None else 'null',
            "printnumber": obj.get("printnumber") if obj.get("printnumber") is not None else null,
            "printoutcome": obj.get("printoutcome") if obj.get("printoutcome") is not None else null,
            "printseal": obj.get("printseal") if obj.get("printseal") is not None else 'null',
            "printsignature": obj.get("printsignature") if obj.get("printsignature") is not None else 'null',
            "printteacher": obj.get("printteacher") if obj.get("printteacher") is not None else null,
            "printwmark": obj.get("printwmark") if obj.get("printwmark") is not None else 'null',
            "reportcert": obj.get("reportcert") if obj.get("reportcert") is not None else null,
            "requiredtime": obj.get("requiredtime") if obj.get("requiredtime") is not None else null,
            "requiredtimenotmet": obj.get("requiredtimenotmet") if obj.get("requiredtimenotmet") is not None else null,
            "savecert": obj.get("savecert") if obj.get("savecert") is not None else null,
            "section": obj.get("section"),
            "timecreated": obj.get("timecreated"),
            "timemodified": obj.get("timemodified"),
            "visible": obj.get("visible")
        })
        return _obj

