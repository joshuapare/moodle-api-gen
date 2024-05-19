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
    /// CoreCustomfieldReloadTemplate200ResponseCategoriesInner
    /// </summary>
    [DataContract(Name = "core_customfield_reload_template_200_response_categories_inner")]
    public partial class CoreCustomfieldReloadTemplate200ResponseCategoriesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCustomfieldReloadTemplate200ResponseCategoriesInner" /> class.
        /// </summary>
        /// <param name="addfieldmenu">addfieldmenu (default to &quot;null&quot;).</param>
        /// <param name="fields">fields.</param>
        /// <param name="id">id.</param>
        /// <param name="nameeditable">inplace editable name (default to &quot;null&quot;).</param>
        public CoreCustomfieldReloadTemplate200ResponseCategoriesInner(string addfieldmenu = @"null", List<CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFieldsInner> fields = default(List<CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFieldsInner>), int id = default(int), string nameeditable = @"null")
        {
            // use default value if no "addfieldmenu" provided
            this.Addfieldmenu = addfieldmenu ?? @"null";
            this.Fields = fields;
            this.Id = id;
            // use default value if no "nameeditable" provided
            this.Nameeditable = nameeditable ?? @"null";
        }

        /// <summary>
        /// addfieldmenu
        /// </summary>
        /// <value>addfieldmenu</value>
        [DataMember(Name = "addfieldmenu", EmitDefaultValue = false)]
        public string Addfieldmenu { get; set; }

        /// <summary>
        /// Gets or Sets Fields
        /// </summary>
        [DataMember(Name = "fields", EmitDefaultValue = false)]
        public List<CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFieldsInner> Fields { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// inplace editable name
        /// </summary>
        /// <value>inplace editable name</value>
        [DataMember(Name = "nameeditable", EmitDefaultValue = false)]
        public string Nameeditable { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCustomfieldReloadTemplate200ResponseCategoriesInner {\n");
            sb.Append("  Addfieldmenu: ").Append(Addfieldmenu).Append("\n");
            sb.Append("  Fields: ").Append(Fields).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Nameeditable: ").Append(Nameeditable).Append("\n");
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
