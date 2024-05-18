# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_competency_read_user_evidence200_response import CoreCompetencyReadUserEvidence200Response

class TestCoreCompetencyReadUserEvidence200Response(unittest.TestCase):
    """CoreCompetencyReadUserEvidence200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCompetencyReadUserEvidence200Response:
        """Test CoreCompetencyReadUserEvidence200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCompetencyReadUserEvidence200Response`
        """
        model = CoreCompetencyReadUserEvidence200Response()
        if include_optional:
            return CoreCompetencyReadUserEvidence200Response(
                canmanage = True,
                competencies = [
                    openapi_client.models.core_competency_read_user_evidence_200_response_competencies_inner.core_competency_read_user_evidence_200_response_competencies_inner(
                        competencyframeworkid = 56, 
                        description = '', 
                        descriptionformat = 56, 
                        id = 56, 
                        idnumber = '', 
                        parentid = 56, 
                        path = '/0/', 
                        ruleconfig = '', 
                        ruleoutcome = 56, 
                        ruletype = '', 
                        scaleconfiguration = '', 
                        scaleid = 56, 
                        shortname = '', 
                        sortorder = 56, 
                        timecreated = 56, 
                        timemodified = 56, 
                        usermodified = 56, )
                    ],
                competencycount = 56,
                description = '',
                descriptionformat = 56,
                filecount = 56,
                files = [
                    openapi_client.models.core_competency_read_user_evidence_200_response_files_inner.core_competency_read_user_evidence_200_response_files_inner(
                        author = 'null', 
                        component = '', 
                        contextid = 56, 
                        filearea = 'null', 
                        filename = 'null', 
                        filenameshort = 'null', 
                        filepath = 'null', 
                        filesize = 56, 
                        filesizeformatted = 'null', 
                        icon = 'null', 
                        isdir = True, 
                        isimage = True, 
                        itemid = 56, 
                        license = 'null', 
                        timecreated = 56, 
                        timecreatedformatted = 'null', 
                        timemodified = 56, 
                        timemodifiedformatted = 'null', 
                        url = '', )
                    ],
                hasurlorfiles = True,
                id = 56,
                name = '',
                timecreated = 56,
                timemodified = 56,
                url = '',
                urlshort = 'null',
                userid = 56,
                usermodified = 56
            )
        else:
            return CoreCompetencyReadUserEvidence200Response(
                canmanage = True,
                competencies = [
                    openapi_client.models.core_competency_read_user_evidence_200_response_competencies_inner.core_competency_read_user_evidence_200_response_competencies_inner(
                        competencyframeworkid = 56, 
                        description = '', 
                        descriptionformat = 56, 
                        id = 56, 
                        idnumber = '', 
                        parentid = 56, 
                        path = '/0/', 
                        ruleconfig = '', 
                        ruleoutcome = 56, 
                        ruletype = '', 
                        scaleconfiguration = '', 
                        scaleid = 56, 
                        shortname = '', 
                        sortorder = 56, 
                        timecreated = 56, 
                        timemodified = 56, 
                        usermodified = 56, )
                    ],
                competencycount = 56,
                description = '',
                filecount = 56,
                files = [
                    openapi_client.models.core_competency_read_user_evidence_200_response_files_inner.core_competency_read_user_evidence_200_response_files_inner(
                        author = 'null', 
                        component = '', 
                        contextid = 56, 
                        filearea = 'null', 
                        filename = 'null', 
                        filenameshort = 'null', 
                        filepath = 'null', 
                        filesize = 56, 
                        filesizeformatted = 'null', 
                        icon = 'null', 
                        isdir = True, 
                        isimage = True, 
                        itemid = 56, 
                        license = 'null', 
                        timecreated = 56, 
                        timecreatedformatted = 'null', 
                        timemodified = 56, 
                        timemodifiedformatted = 'null', 
                        url = '', )
                    ],
                hasurlorfiles = True,
                id = 56,
                name = '',
                timecreated = 56,
                timemodified = 56,
                url = '',
                urlshort = 'null',
                userid = 56,
                usermodified = 56,
        )
        """

    def testCoreCompetencyReadUserEvidence200Response(self):
        """Test CoreCompetencyReadUserEvidence200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()