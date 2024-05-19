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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ModAssignSaveSubmissionRequest
    /// </summary>
    [DataContract(Name = "mod_assign_save_submission_request")]
    public partial class ModAssignSaveSubmissionRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignSaveSubmissionRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModAssignSaveSubmissionRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignSaveSubmissionRequest" /> class.
        /// </summary>
        /// <param name="assignmentid">The assignment id to operate on (required).</param>
        /// <param name="plugindata">plugindata (required).</param>
        public ModAssignSaveSubmissionRequest(int assignmentid = default(int), ModAssignSaveSubmissionRequestPlugindata plugindata = default(ModAssignSaveSubmissionRequestPlugindata))
        {
            this.Assignmentid = assignmentid;
            // to ensure "plugindata" is required (not null)
            if (plugindata == null)
            {
                throw new ArgumentNullException("plugindata is a required property for ModAssignSaveSubmissionRequest and cannot be null");
            }
            this.Plugindata = plugindata;
        }

        /// <summary>
        /// The assignment id to operate on
        /// </summary>
        /// <value>The assignment id to operate on</value>
        [DataMember(Name = "assignmentid", IsRequired = true, EmitDefaultValue = true)]
        public int Assignmentid { get; set; }

        /// <summary>
        /// Gets or Sets Plugindata
        /// </summary>
        [DataMember(Name = "plugindata", IsRequired = true, EmitDefaultValue = true)]
        public ModAssignSaveSubmissionRequestPlugindata Plugindata { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignSaveSubmissionRequest {\n");
            sb.Append("  Assignmentid: ").Append(Assignmentid).Append("\n");
            sb.Append("  Plugindata: ").Append(Plugindata).Append("\n");
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