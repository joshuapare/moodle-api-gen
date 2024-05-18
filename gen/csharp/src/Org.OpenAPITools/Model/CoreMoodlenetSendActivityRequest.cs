/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreMoodlenetSendActivityRequest
    /// </summary>
    [DataContract(Name = "core_moodlenet_send_activity_request")]
    public partial class CoreMoodlenetSendActivityRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMoodlenetSendActivityRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreMoodlenetSendActivityRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMoodlenetSendActivityRequest" /> class.
        /// </summary>
        /// <param name="cmid">Course module ID (required) (default to null).</param>
        /// <param name="issuerid">OAuth 2 issuer ID (required).</param>
        /// <param name="shareformat">Share format (required) (default to null).</param>
        public CoreMoodlenetSendActivityRequest(int cmid = null, int issuerid = default(int), int shareformat = null)
        {
            this.Cmid = cmid;
            this.Issuerid = issuerid;
            this.Shareformat = shareformat;
        }

        /// <summary>
        /// Course module ID
        /// </summary>
        /// <value>Course module ID</value>
        [DataMember(Name = "cmid", IsRequired = true, EmitDefaultValue = true)]
        public int Cmid { get; set; }

        /// <summary>
        /// OAuth 2 issuer ID
        /// </summary>
        /// <value>OAuth 2 issuer ID</value>
        [DataMember(Name = "issuerid", IsRequired = true, EmitDefaultValue = true)]
        public int Issuerid { get; set; }

        /// <summary>
        /// Share format
        /// </summary>
        /// <value>Share format</value>
        [DataMember(Name = "shareformat", IsRequired = true, EmitDefaultValue = true)]
        public int Shareformat { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMoodlenetSendActivityRequest {\n");
            sb.Append("  Cmid: ").Append(Cmid).Append("\n");
            sb.Append("  Issuerid: ").Append(Issuerid).Append("\n");
            sb.Append("  Shareformat: ").Append(Shareformat).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}