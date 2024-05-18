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
    /// CoreCompetencyDeleteTemplateRequest
    /// </summary>
    [DataContract(Name = "core_competency_delete_template_request")]
    public partial class CoreCompetencyDeleteTemplateRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyDeleteTemplateRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCompetencyDeleteTemplateRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyDeleteTemplateRequest" /> class.
        /// </summary>
        /// <param name="deleteplans">Boolean to indicate if plans must be deleted (required) (default to null).</param>
        /// <param name="id">Data base record id for the template (required) (default to null).</param>
        public CoreCompetencyDeleteTemplateRequest(bool deleteplans = null, int id = null)
        {
            this.Deleteplans = deleteplans;
            this.Id = id;
        }

        /// <summary>
        /// Boolean to indicate if plans must be deleted
        /// </summary>
        /// <value>Boolean to indicate if plans must be deleted</value>
        [DataMember(Name = "deleteplans", IsRequired = true, EmitDefaultValue = true)]
        public bool Deleteplans { get; set; }

        /// <summary>
        /// Data base record id for the template
        /// </summary>
        /// <value>Data base record id for the template</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompetencyDeleteTemplateRequest {\n");
            sb.Append("  Deleteplans: ").Append(Deleteplans).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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