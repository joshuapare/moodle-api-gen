# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_iomadcertificate_get_iomadcertificates_by_courses200_response import ModIomadcertificateGetIomadcertificatesByCourses200Response

class TestModIomadcertificateGetIomadcertificatesByCourses200Response(unittest.TestCase):
    """ModIomadcertificateGetIomadcertificatesByCourses200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModIomadcertificateGetIomadcertificatesByCourses200Response:
        """Test ModIomadcertificateGetIomadcertificatesByCourses200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModIomadcertificateGetIomadcertificatesByCourses200Response`
        """
        model = ModIomadcertificateGetIomadcertificatesByCourses200Response()
        if include_optional:
            return ModIomadcertificateGetIomadcertificatesByCourses200Response(
                iomadcertificates = [
                    openapi_client.models.mod_iomadcertificate_get_iomadcertificates_by_courses_200_response_iomadcertificates_inner.mod_iomadcertificate_get_iomadcertificates_by_courses_200_response_iomadcertificates_inner(
                        bordercolor = 'null', 
                        borderstyle = 'null', 
                        course = 56, 
                        coursemodule = 56, 
                        customtext = 'null', 
                        datefmt = 56, 
                        delivery = 56, 
                        emailothers = 'null', 
                        emailteachers = 56, 
                        gradefmt = 56, 
                        groupingid = 56, 
                        groupmode = 56, 
                        id = 56, 
                        intro = 'null', 
                        introformat = 56, 
                        iomadcertificatetype = 'null', 
                        name = 'null', 
                        orientation = 'null', 
                        printdate = 'null', 
                        printgrade = 56, 
                        printhours = 'null', 
                        printnumber = 56, 
                        printoutcome = 56, 
                        printseal = 'null', 
                        printsignature = 'null', 
                        printteacher = 56, 
                        printwmark = 'null', 
                        reportcert = 56, 
                        requiredtime = 56, 
                        requiredtimenotmet = 56, 
                        savecert = 56, 
                        section = 56, 
                        timecreated = 56, 
                        timemodified = 56, 
                        visible = 56, )
                    ],
                warnings = [
                    openapi_client.models.auth_email_signup_user_200_response_warnings_inner.auth_email_signup_user_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return ModIomadcertificateGetIomadcertificatesByCourses200Response(
                iomadcertificates = [
                    openapi_client.models.mod_iomadcertificate_get_iomadcertificates_by_courses_200_response_iomadcertificates_inner.mod_iomadcertificate_get_iomadcertificates_by_courses_200_response_iomadcertificates_inner(
                        bordercolor = 'null', 
                        borderstyle = 'null', 
                        course = 56, 
                        coursemodule = 56, 
                        customtext = 'null', 
                        datefmt = 56, 
                        delivery = 56, 
                        emailothers = 'null', 
                        emailteachers = 56, 
                        gradefmt = 56, 
                        groupingid = 56, 
                        groupmode = 56, 
                        id = 56, 
                        intro = 'null', 
                        introformat = 56, 
                        iomadcertificatetype = 'null', 
                        name = 'null', 
                        orientation = 'null', 
                        printdate = 'null', 
                        printgrade = 56, 
                        printhours = 'null', 
                        printnumber = 56, 
                        printoutcome = 56, 
                        printseal = 'null', 
                        printsignature = 'null', 
                        printteacher = 56, 
                        printwmark = 'null', 
                        reportcert = 56, 
                        requiredtime = 56, 
                        requiredtimenotmet = 56, 
                        savecert = 56, 
                        section = 56, 
                        timecreated = 56, 
                        timemodified = 56, 
                        visible = 56, )
                    ],
        )
        """

    def testModIomadcertificateGetIomadcertificatesByCourses200Response(self):
        """Test ModIomadcertificateGetIomadcertificatesByCourses200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()