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
    /// CoreCustomfieldMoveCategoryRequest
    /// </summary>
    [DataContract(Name = "core_customfield_move_category_request")]
    public partial class CoreCustomfieldMoveCategoryRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCustomfieldMoveCategoryRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCustomfieldMoveCategoryRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCustomfieldMoveCategoryRequest" /> class.
        /// </summary>
        /// <param name="beforeid">Id of the category before which it needs to be moved (default to 0).</param>
        /// <param name="id">Category ID to move (required) (default to null).</param>
        public CoreCustomfieldMoveCategoryRequest(int beforeid = 0, int id = null)
        {
            this.Id = id;
            this.Beforeid = beforeid;
        }

        /// <summary>
        /// Id of the category before which it needs to be moved
        /// </summary>
        /// <value>Id of the category before which it needs to be moved</value>
        [DataMember(Name = "beforeid", EmitDefaultValue = false)]
        public int Beforeid { get; set; }

        /// <summary>
        /// Category ID to move
        /// </summary>
        /// <value>Category ID to move</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCustomfieldMoveCategoryRequest {\n");
            sb.Append("  Beforeid: ").Append(Beforeid).Append("\n");
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