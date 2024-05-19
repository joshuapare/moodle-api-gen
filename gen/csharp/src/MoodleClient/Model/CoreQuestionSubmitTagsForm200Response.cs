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
    /// CoreQuestionSubmitTagsForm200Response
    /// </summary>
    [DataContract(Name = "core_question_submit_tags_form_200_response")]
    public partial class CoreQuestionSubmitTagsForm200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreQuestionSubmitTagsForm200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreQuestionSubmitTagsForm200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreQuestionSubmitTagsForm200Response" /> class.
        /// </summary>
        /// <param name="status">status: true if success (required).</param>
        public CoreQuestionSubmitTagsForm200Response(bool status = default(bool))
        {
            this.Status = status;
        }

        /// <summary>
        /// status: true if success
        /// </summary>
        /// <value>status: true if success</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public bool Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreQuestionSubmitTagsForm200Response {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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