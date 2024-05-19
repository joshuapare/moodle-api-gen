# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_competency_create_template200_response import CoreCompetencyCreateTemplate200Response

class TestCoreCompetencyCreateTemplate200Response(unittest.TestCase):
    """CoreCompetencyCreateTemplate200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCompetencyCreateTemplate200Response:
        """Test CoreCompetencyCreateTemplate200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCompetencyCreateTemplate200Response`
        """
        model = CoreCompetencyCreateTemplate200Response()
        if include_optional:
            return CoreCompetencyCreateTemplate200Response(
                canmanage = True,
                canread = True,
                cohortscount = 56,
                contextid = 56,
                contextname = '',
                contextnamenoprefix = '',
                description = '',
                descriptionformat = 56,
                duedate = 56,
                duedateformatted = '',
                id = 56,
                planscount = 56,
                shortname = '',
                timecreated = 56,
                timemodified = 56,
                usermodified = 56,
                visible = True
            )
        else:
            return CoreCompetencyCreateTemplate200Response(
                canmanage = True,
                canread = True,
                cohortscount = 56,
                contextid = 56,
                contextname = '',
                contextnamenoprefix = '',
                description = '',
                duedate = 56,
                duedateformatted = '',
                id = 56,
                planscount = 56,
                shortname = '',
                timecreated = 56,
                timemodified = 56,
                usermodified = 56,
                visible = True,
        )
        """

    def testCoreCompetencyCreateTemplate200Response(self):
        """Test CoreCompetencyCreateTemplate200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
