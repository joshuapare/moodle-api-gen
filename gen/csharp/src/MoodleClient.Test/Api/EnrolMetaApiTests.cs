/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using MoodleClient.Client;
using MoodleClient.Api;
// uncomment below to import models
//using MoodleClient.Model;

namespace MoodleClient.Test.Api
{
    /// <summary>
    ///  Class for testing EnrolMetaApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class EnrolMetaApiTests : IDisposable
    {
        private EnrolMetaApi instance;

        public EnrolMetaApiTests()
        {
            instance = new EnrolMetaApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of EnrolMetaApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' EnrolMetaApi
            //Assert.IsType<EnrolMetaApi>(instance);
        }

        /// <summary>
        /// Test EnrolMetaAddInstances
        /// </summary>
        [Fact]
        public void EnrolMetaAddInstancesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //EnrolMetaAddInstancesRequest enrolMetaAddInstancesRequest = null;
            //var response = instance.EnrolMetaAddInstances(enrolMetaAddInstancesRequest);
            //Assert.IsType<Object>(response);
        }

        /// <summary>
        /// Test EnrolMetaDeleteInstances
        /// </summary>
        [Fact]
        public void EnrolMetaDeleteInstancesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //EnrolMetaDeleteInstancesRequest enrolMetaDeleteInstancesRequest = null;
            //var response = instance.EnrolMetaDeleteInstances(enrolMetaDeleteInstancesRequest);
            //Assert.IsType<Object>(response);
        }
    }
}
