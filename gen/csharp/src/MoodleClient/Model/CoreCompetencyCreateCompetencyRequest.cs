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
    /// CoreCompetencyCreateCompetencyRequest
    /// </summary>
    [DataContract(Name = "core_competency_create_competency_request")]
    public partial class CoreCompetencyCreateCompetencyRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyCreateCompetencyRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCompetencyCreateCompetencyRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyCreateCompetencyRequest" /> class.
        /// </summary>
        /// <param name="competency">competency (required).</param>
        public CoreCompetencyCreateCompetencyRequest(CoreCompetencyCreateCompetencyRequestCompetency competency = default(CoreCompetencyCreateCompetencyRequestCompetency))
        {
            // to ensure "competency" is required (not null)
            if (competency == null)
            {
                throw new ArgumentNullException("competency is a required property for CoreCompetencyCreateCompetencyRequest and cannot be null");
            }
            this.Competency = competency;
        }

        /// <summary>
        /// Gets or Sets Competency
        /// </summary>
        [DataMember(Name = "competency", IsRequired = true, EmitDefaultValue = true)]
        public CoreCompetencyCreateCompetencyRequestCompetency Competency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompetencyCreateCompetencyRequest {\n");
            sb.Append("  Competency: ").Append(Competency).Append("\n");
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
